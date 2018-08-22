package hello.storage.exception;

public class StorageException extends RuntimeException {
    /**
     * 自定义异常
     * @param message
     */

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
