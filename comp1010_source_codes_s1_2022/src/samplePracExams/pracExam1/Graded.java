package samplePracExams.pracExam1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
public @interface Graded {
	String description();
	int marks();
}
