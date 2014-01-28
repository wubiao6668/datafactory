package org.paragon.datafactory.factory;

import lombok.Getter;
import org.paragon.datafactory.data.Text;
import org.paragon.datafactory.data.impl.NLTextImpl;

import java.util.Locale;

public class TextFactory {

	@Getter
	private Text text;

	public TextFactory(Locale locale) {
		if (locale != null) {
			// Use the country based on the ISO 3166-2 code
			switch (locale.getCountry()) {
				case "NL":
					text = new NLTextImpl();
					break;
				default:
					text = new NLTextImpl();
					break;
			}
		} else {
			text = new NLTextImpl();
		}
	}
}
