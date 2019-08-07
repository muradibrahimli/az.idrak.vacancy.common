package az.idrak.vacancy.common.enums;

public enum ActivityStatus {

    ACTIVE(1, "Aktiv"),
    INACTIVE(0, "Qeyri-aktiv");

    private int code;
    private String description;

    ActivityStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Integer getCode(ActivityStatus status) {
        return (status == null) ? null : status.code;
    }

    public static ActivityStatus lookup(Integer code){
        if (code == null){
            return null;
        }

        for (ActivityStatus status: values()){
            if (status.code == code){
                return status;
            }
        }
         throw new IllegalArgumentException("No match");
    }
}