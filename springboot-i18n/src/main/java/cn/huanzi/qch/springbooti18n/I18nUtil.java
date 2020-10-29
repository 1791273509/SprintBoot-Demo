package cn.huanzi.qch.springbooti18n;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class I18nUtil {

    private static MessageSource messageSource;

    public I18nUtil(MessageSource messageSource) {
        I18nUtil.messageSource = messageSource;
    }

    /**
     * 获取单个国际化翻译值
     */
    public static String get(String msgKey) {
        log.info("msgKey:{}",msgKey);
        try {
            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }

    public static void main(String[] args) {
        System.out.println(I18nUtil.get("welcome"));
    }
}
