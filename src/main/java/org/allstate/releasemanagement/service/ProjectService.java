package org.allstate.releasemanagement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.allstate.releasemanagement.model.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

	private List<Project> myTopics = new ArrayList<Project>(
			Arrays.asList(new Project("12", "About Drivewise", "Will", "SMith", "Addy", "Drivewise"),
					new Project("12", "About New State", "Mark", "Kate", "Lidy", "Drivewise"),
					new Project("12", "About Prior Insurance", "Soddy", "Prea", "Sara", "Insurance"),
					new Project("12", "About Driver", "Will", "Bella", "Sara", "Driver"),
					new Project("12", "About Vehicle", "Will", "Ashton", "John", "Vehicle"),
					new Project("12", "About Company", "Will", "Tom", "Mike", "Company")));

	public List<Project> getAllProjects() {

		return myTopics;
	}

	public Project getProject(String id) {

		return myTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addProject(Project aNewTopic) {
		// List<Topics> myNewTopics=new ArrayList<Topics>(myTopics);
		myTopics.add(aNewTopic);

	}
}
