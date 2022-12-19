package com.example.project.emailAuth;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
	
	//by 박은영
	
	@Bean
	public JavaMailSender javaMailService() {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		
		javaMailSender.setHost("smtp.naver.com");
		javaMailSender.setUsername(""); //시연시 이메일 입력 필요
		javaMailSender.setPassword(""); //시연시 비밀번호 입력 필요
		
		javaMailSender.setPort(465);
		javaMailSender.setJavaMailProperties(getMailProperties());
		javaMailSender.setDefaultEncoding("UTF-8");
		
		return javaMailSender;
	}
	
	
	private Properties getMailProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.transport.protocol", "smtp"); //프로토콜 설정
		properties.setProperty("mail.smtp.auth", "true"); //smtp 인증
		properties.setProperty("mail.smtp.starttls.enable", "true"); //smtp strattles 사용
		properties.setProperty("mail.debug", "true"); //디버그 사용
		properties.setProperty("mail.smtp.ssl.trust", "smtp.naver.com"); //ssl 인증 서버: smtp.naver.com
		properties.setProperty("mail.smtp.ssl.enable", "true"); //ssl 사용
		
		return properties;
	}
}
