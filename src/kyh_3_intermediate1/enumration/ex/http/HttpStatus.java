package kyh_3_intermediate1.enumration.ex.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus httpStatus : values()) {
            if (httpStatus.getCode() == code) {
                return httpStatus;
            }
        }

        return null;
    }

    public boolean isSuccess() {
        return 200 <= code && code <= 299;
    }
}