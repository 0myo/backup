package kr.or.ddit.command;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AttachRegistCommand {
	private List<MultipartFile> uploadFile;
}
