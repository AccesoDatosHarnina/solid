package segregacioninterfaces02;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public interface Bird {
	public default String eat() {
		return"todos comen igual";
	}

	public String tweet();
}
