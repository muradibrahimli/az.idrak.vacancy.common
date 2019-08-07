package az.idrak.vacancy.common.enums;

public enum WorkStatus {

    FullTime(1, "Full-time"),
    PartTime(0, "Part-time");

    private int code;
    private String description;

    WorkStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Integer getCode(WorkStatus workStatus) {
        return (workStatus == null) ? null : workStatus.code;
    }

    public static WorkStatus lookup(Integer code){
        if (code == null){
            return null;
        }

        for (WorkStatus workStatus: values()){
            if (workStatus.code == code){
                return workStatus;
            }
        }
         throw new IllegalArgumentException("No match");
    }
}