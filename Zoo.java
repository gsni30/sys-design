// Your task is to create a simple system that can keep track of animals in a zoo. The system should be able to handle the following requirements:

// Add new animals to the system, each with characteristics such as species, name, age, and health status.
// Organize animals into different habitats or enclosures based on their species.
// Keep track of feeding schedules for different animals.
// Implement a way to record medical history and treatments for each animal.

// Health: healthy, sluggish, ill, criticallyill

// Health: status, list<illness>




class Animal {
    // add attributes
    // add constructor
		
    // Getters and setters for each field
    // ...
    
    String name;
    int age; // in days
    Health health;
    Guid id;
    
  	public Animal(String name, Health healthStatus, int age)

    public void eat() {
        // Implementation for eating
    }
    
    public void sleep() {
        // Implementation for sleeping
    }
}


MonkeyClass: enum MonkeyType

class Monkey extends Animal {
	MonkeyType monkeyType;
  
  public Monkey(String name, Health healthStatus, int age, MonkeyType monkeyType) {
  	new Animal(name, age, healthStatus, age);
    this.monkeyType = monkeyType;
  }
  
}


// Animal 
// Monkey
// Cat

// 

// Habitat class
// 
class Habitat {
		private String name;
    private Set<Animal> animals;
    int maximumCapacity;
    //id 

    // add attributes
    // add constructor
    
    // booelan enclosed;
    // int area;
    // 

    // Methods to add or remove animals
    // ...
    
    public void addAnimal(Animal animal) {
    	if (animals.size() < maxCapacity)
    		animals.add(animal);
      
      throw new Error("Habitat is full");
    }
    
    public void removeAnimal(Animal animal) {
    	animals.remove(animal);
    }
}





// FeedingSchedule class
class FeedingSchedule {
    // how would you keep track of feeding schedule for each animal?

    // Methods to update feeding times
    // ...

}

// MedicalRecord class
class MedicalRecord {
    

    // Methods to add medical history entries
    // ...
}

// Main ZooManagementSystem class
public class ZooManagementSystem {
    private List<Habitat> habitats;
    private List<FeedingSchedule> feedingSchedules;
    private List<MedicalRecord> medicalRecords;

    public ZooManagementSystem() {
        this.habitats = new ArrayList<>();
        this.feedingSchedules = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
    }

    // Methods to manage the zoo
    // ...
}