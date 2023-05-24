package com.green.board7.fileupload;


import com.green.board7.cmt.CmtMapper;
import com.green.board7.fileupload.model.FileEntity;
import com.green.board7.fileupload.model.FileUploadInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileUploadService {

    private final FileUploadMapper mapper;
    @Autowired
    public FileUploadService(FileUploadMapper mapper){
        this.mapper = mapper;
    }

    @Value("${file.dir}")
    private String fileDir;


    public void FileUpload(FileUploadInsDto dto, MultipartFile img){
        System.out.println("fileDir :" + fileDir);

        //원래 파일 이름 추출
        String originFileName = img.getOriginalFilename();

        //파일 이름으로 사용할 uuid생성
        String uuid = UUID.randomUUID().toString();

        int dotIdx = originFileName.lastIndexOf(".");
        String ext = originFileName.substring(dotIdx);

        String savedFileName = uuid+ext;
        String savedFilePath = fileDir + savedFileName;

        File file = new File(savedFilePath);
        try {
            img.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileEntity entity = FileEntity.builder()
                        .path(savedFilePath)
                        .uploader(dto.getUploader())
                        .levelValue(dto.getLevelValue())
                        .build();

        mapper.insFile(entity);
    }
}
