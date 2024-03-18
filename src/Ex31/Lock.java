package Ex31;

class Lock {
    private String code;

    public Lock(String code) {
        this.code = code;
    }

    public boolean unlock(String key) {
        return key.equals(code);
    }
}
