package lang.enums.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    ;

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    @Override
    public String toString() {
        return "HttpStatus{" +
            "code=" + code +
            ", message='" + message + '\'' +
            '}' +
            " isSuccess=" + isSuccess();
    }
}
