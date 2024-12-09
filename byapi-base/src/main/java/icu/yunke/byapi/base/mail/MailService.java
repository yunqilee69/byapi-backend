package icu.yunke.byapi.base.mail;

import icu.yunke.byapi.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/9 21:49
 * @description: 邮箱服务类
 */
@Slf4j
@Service
public class MailService {

    @Resource
    private JavaMailSender mailSender;

    @Resource
    private MailProperties mailProperties;

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param content
     * @return
     * @throws MessagingException
     */
    public void sendMail(String to, String subject, String content) throws MessagingException {
        MimeMessageHelper helper = new MimeMessageHelper(mailSender.createMimeMessage(), true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        helper.setFrom(mailProperties.getUsername());

        try {
            mailSender.send(helper.getMimeMessage());
        } catch (MailException e) {
            log.error("邮件发送失败，to:{}, subject:{}, content:{}", to, subject, content);
            throw new BizException("邮件发送失败", e);
        }
    }

}
