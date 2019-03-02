package com.main.learn.designModel.createDesignModel.prototype;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class Mail implements Cloneable {
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String context;
    //邮件的尾部，一般都是加上“XXX版权所有”等信息
    private String tail;

    //构建函数
    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
