package Java8Ex;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	


		public static void main(String[] args) {
			
			List<Student> studList = new ArrayList<>();
			studList.add(new Student(1,"dora","chennai","female","09-01-2000",90));
			studList.add(new Student(2,"buji","chennai","male","09-02-2001",95));
			studList.add(new Student(3,"jack","chennai","male","09-03-2000",35));
		    studList.add(new Student(4,"saro","chennai","female","24-01-2015",70));
		    
		   
	        Stream<List<Student>> stream=Stream.of(studList);
	        
	        BiFunction<LocalDate,LocalDate,Integer> presentAge=(dob,presentDate)->{
	            return Period.between(dob,presentDate).getYears();
	        };
	        
	        
	        //calculate age of students
	        studList.stream().forEach(s-> {
	            s.setAge(presentAge.apply(s.getDob(),LocalDate.now()));
	                });
	        
	        
	        //Names starting with "s"
	        System.out.println("Student's name starting with 's' :");
	        List<String> names=studList.stream()
	                .filter(s->s.getName().toLowerCase().startsWith("s"))
	                .map(Student::getName)
	                .collect(Collectors.toList());
	        
	        names.forEach(e -> System.out.println(e));
	        
	        // //Names whose age > 10
	        System.out.println("Names of students whose age > 10 :");
	        Predicate<Student> ageCheck=(s)->(s.getAge()>10);
	        
	        List<String> studentAbove10 = studList.stream()
	                  .filter(ageCheck)
	                  .map(Student::getName)
	                  .collect(Collectors.toList());
	        
	        studentAbove10.forEach(e -> System.out.println(e));
	        
	        //sort by name
	        System.out.println("Sorted List :");
	        List<String> sortedList = studList.stream()
	                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
	                .map(Student::getName)
	                .collect(Collectors.toList());
	        
	        sortedList.forEach(e -> System.out.println(e));
	        
	        //display top 5 students
	        System.out.println("Top 5 students :");
	        List<String> top5List = studList.stream()
	                .sorted((s1, s2) -> Integer.valueOf(s2.getMark()).compareTo(Integer.valueOf(s1.getMark())))
	                .limit(5)
	                .map(Student::getName)
	                .collect(Collectors.toList());
	        
	        top5List.forEach(e -> System.out.println(e));    

	}
			
}
