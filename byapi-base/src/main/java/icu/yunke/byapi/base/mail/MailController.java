package icu.yunke.byapi.base.mail;

import icu.yunke.byapi.common.web.base.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/9 21:49
 * @description: 邮箱接口，调用后发送邮件
 */
@RestController
@RequestMapping("/base/mail")
public class MailController {

    @Resource
    private MailService mailService;

    @PostMapping
    public Result<String> testSendMail() throws MessagingException {
        mailService.sendMail("1592372425@qq.com", "白云API", "测试内容");
        return Result.success("success");
    }

}
