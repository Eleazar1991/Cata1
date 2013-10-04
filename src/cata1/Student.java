package cata1;

import java.util.Date;

public class Student {

    private String name;
    private Date age;
    private static final long MILLISECOND_PER_MINUTE = (1000 * 60);
    private static final long MILLISECOND_PER_HOUR = (MILLISECOND_PER_MINUTE * 60);
    private static final long MILLISECOND_PER_DAY = (MILLISECOND_PER_HOUR * 24);
    private static final long MILLISECOND_PER_YEAR = (MILLISECOND_PER_DAY * 365);

    public Student(String name, Date age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Date getAge() {
        return age;
    }

    public int getBirthDate() {
        Date date = new Date();
        long ageMilliseconds = date.getTime() - this.age.getTime();
        return (int) (ageMilliseconds / MILLISECOND_PER_YEAR);
    }
}
