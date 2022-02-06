import java.nio.file.Path;
import java.nio.file.Paths;

public class FileConfigurator {
	
	private final String targetDirectory = "C:/glassfish5/glassfish/domains/domain1/autodeploy/";
	
	private String sourceDirectory;
	private String sourceName;
	private String targetName;
	
	Path source;
	Path target;
	
	
	
	public FileConfigurator(String sourceDirectory, String sourceName, String targetName) {
		this.sourceDirectory = sourceDirectory;
		this.sourceName = sourceName;
		this.targetName = targetName;
	}
	
	
	public void generatePath() {
		this.source = Paths.get(sourceDirectory.concat(sourceName));
		this.target = Paths.get(targetDirectory.concat(targetName));
	}
	

	public String getSourceDirectory() {
		return sourceDirectory;
	}


	public void setSourceDirectory(String sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
	}


	public String getSourceName() {
		return sourceName;
	}


	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}


	public String getTargetDirectory() {
		return targetDirectory;
	}


	public String getTargetName() {
		return targetName;
	}


	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}


	public Path getSource() {
		return source;
	}


	public void setSource(Path source) {
		this.source = source;
	}


	public Path getTarget() {
		return target;
	}


	public void setTarget(Path target) {
		this.target = target;
	}

}
