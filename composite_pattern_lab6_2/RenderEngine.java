package composite_pattern_lab6_2;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class RenderEngine extends ARenderEngine{

	@Override
	public void executePrint(AComponent root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AComponent constructTree(File file) {
		Document doc = null;
		try {
			doc = Jsoup.parse(file, "UTF8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Node root = (Node )doc.select("html").get(0);
		
		AComponent component = getCompoment(root);
		return component;
	}
	private AComponent getCompoment(Node root) {
		AComponent component = null;
		if (root.childNodeSize() > 0) {
			component = new Composite(((Element) root).cssSelector());
			for (Node node : root.childNodes()) {
				component.add(getCompoment(node));
			}
		} else {
			component = new Leaf("1", (root).nodeName());
		}
		return component;
	}
	
	@Override
	public void layout(AComponent root) {
		// TODO Auto-generated method stub
		
	}

}
