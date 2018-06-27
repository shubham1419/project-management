package com.shubham.projectmanagement.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shubham.projectmanagement.configuration.HibernateConfig;
import com.shubham.projectmanagement.dao.ProjectDao;
import com.shubham.projectmanagement.dao.TaskDao;
import com.shubham.projectmanagement.dto.Project;
import com.shubham.projectmanagement.dto.Task;



public class ProjectTaskTestCase {
	
	private static ProjectDao projectDao;
	private static TaskDao taskDao;
	
	private static AnnotationConfigApplicationContext context;
	
	private Project project;
	private Task task;
	
	//private static List<Developer> devlopers = new ArrayList<>();
/*	static{
		
		Developer developer = new Developer();
		
		developer.setId(1);
        devlopers.add(developer);
        
        developer.setId(2);
        devlopers.add(developer);
		
	}*/
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		projectDao = context.getBean(ProjectDao.class);
		taskDao = context.getBean(TaskDao.class);
	}
	
	@Test
	// Add
	public void CrudProjectTask() {
	
		// for add/Create
		project = new Project();
		task = new Task();
		task.setTasks("Task1");
		task.setStatus(true);
		
		project.setProjectName("Project");
		project.setTeamLeadId(1);
		project.setStatus(true);
		//project.setDevelopersId();
		
		//project.setTasks(task);
		//task.setProject(project);
		
		assertEquals("Failed to add project", true, projectDao.add(project));
		assertEquals("Failed to add task", true, taskDao.add(task));
		
	}
}
