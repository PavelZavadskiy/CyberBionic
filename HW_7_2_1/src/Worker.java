public class Worker {
    private String fio;
    private String jobTitle;
    private String yearOfEmployment;

    public Worker(String fio, String jobTitle, String yearOfEmployment) throws WrongYearOfEmploymentException {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.setYearOfEmployment(yearOfEmployment);
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setYearOfEmployment(String yearOfEmployment) throws WrongYearOfEmploymentException {
        String regex = "\\d{4}";
        if(yearOfEmployment.matches(regex)) {
            this.yearOfEmployment = yearOfEmployment;
        } else {
            throw new WrongYearOfEmploymentException("Exception: Wrong year of employment (use yyyy format)!");
        }
    }

    public String getFio() {
        return fio;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + fio + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", yearOfEmployment='" + yearOfEmployment + '\'' +
                '}';
    }
}
