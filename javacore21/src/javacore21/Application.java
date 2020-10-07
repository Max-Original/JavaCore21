package javacore21;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Application {
	public static void main(String[] args) throws IOException {

		getAnnotationToFile(Car.class);

		Date date = new Date();
		System.out.println(convertToLocalDateViaInstant(date));
		System.out.println(convertToLocalDateTimeViaInstant(date));
		System.out.println(convertToLocalTimeViaInstant(date));

	}

//Writes all abstract fields of the class to a file.
	public static void getAnnotationToFile(Class<?> customClass) throws IOException {
		// write all marked fields to array.
		Field[] fields = customClass.getDeclaredFields();
		// run through array with a variable.
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			// check if field has Annotation from CarInfo Annotation.
			if (field.getAnnotation(CarInfo.class) instanceof CarInfo) {
				String name = field.getName();
				String params = field.getAnnotation(CarInfo.class).value();
				FileWriter writer = new FileWriter("Result.txt", true);
				writer.write(name);
				writer.append('\n');
				writer.write(params);
				writer.append('\n');
				writer.flush();
			}
		}
	}

	// toInstant converts to object with which you can work.
	// atZone does sets time zone.
	// toLocalDate does converts to LocalDate object.
	public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	public static LocalTime convertToLocalTimeViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}
}
