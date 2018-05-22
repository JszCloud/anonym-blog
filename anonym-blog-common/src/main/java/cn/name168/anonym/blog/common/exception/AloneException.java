package cn.name168.anonym.blog.common.exception;

/**
 * created by weirdor on 2018/5/1
 */
public class AloneException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public AloneException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public AloneException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public AloneException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public AloneException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}

