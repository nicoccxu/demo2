package com.example.demo.resp;

public class CommonResp<T> {
    //业务上的失败或成功
    private  boolean success=true;
    //返回信息
    private  String message;
    //返回自定义数据
    private T content;

    public boolean getSuccess(){return  success;}
    public  void setSuccess(boolean success){this.success=success;}
    public String getMessage(){return message;}
    public  void  setMessage(String message){this.message=message;}
    public T getContent(){return content;}
    public  void  setContent(T content){this.content=content;}
}
