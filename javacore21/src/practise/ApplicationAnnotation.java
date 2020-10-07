package practise;

import java.lang.reflect.Field;

public class ApplicationAnnotation {
	public static void main(String[] args) {
		getAnnotationValue(Droid.class);
		System.out.println();
	//	getNoAnnotationValue(Droid.class);
		System.out.println();
	//	getAnnotatedFiledsAndValues(Student.class);
	}

	public static void getAnnotationValue(Class<?> customClass) {
		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(Fielder.class) instanceof Fielder) {
				System.out.println((field.getName() + " ----- "));
				System.out.println("annotation value = " + field.getAnnotation(Fielder.class).params());
			}
		}
	}
	
	public static void getNoAnnotationValue(Class<?> customClass) {
		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (!(field.getAnnotation(Fielder.class) instanceof Fielder)) {
				System.out.println((field.getName() + " ----- "));
			}
		}
	}

	public static void getAnnotatedFiledsAndValues(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(StudentSocial.class) instanceof StudentSocial) {
				System.out.println(field.getType() + " " + field.getName() + " ----->");
				System.out.println("annotation type = " + field.getAnnotation(StudentSocial.class).annotationType());
				System.out.println("annotation value = " + field.getAnnotation(StudentSocial.class).value());
			}
		}
	}
}
