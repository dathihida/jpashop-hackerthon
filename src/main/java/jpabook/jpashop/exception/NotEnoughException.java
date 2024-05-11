package jpabook.jpashop.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class NotEnoughException extends RuntimeException {
    /**
     *
     */
    public NotEnoughException() {
        super();
    }

    /**
     * @param message
     */
    public NotEnoughException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public NotEnoughException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public NotEnoughException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    protected NotEnoughException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * @return
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    /**
     * @return
     */
    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    /**
     * @return
     */
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    /**
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @return
     */
    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     *
     */
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    /**
     * @param s {@code PrintStream} to use for output
     */
    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    /**
     * @param s {@code PrintWriter} to use for output
     */
    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    /**
     * @return
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    /**
     * @return
     */
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    /**
     * @param stackTrace the stack trace elements to be associated with
     *                   this {@code Throwable}.  The specified array is copied by this
     *                   call; changes in the specified array after the method invocation
     *                   returns will have no affect on this {@code Throwable}'s stack
     *                   trace.
     */
    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
