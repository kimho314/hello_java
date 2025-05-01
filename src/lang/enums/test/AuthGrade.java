package lang.enums.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자"),
    ;

    private int level;
    private String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "AuthGrade{" +
            "level=" + level +
            ", description='" + description + '\'' +
            '}';
    }
}
