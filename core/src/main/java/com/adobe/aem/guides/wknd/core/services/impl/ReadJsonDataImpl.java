package com.adobe.aem.guides.wknd.core.services.impl;

import org.osgi.service.component.annotations.Component;

import com.adobe.aem.guides.wknd.core.services.ReadJsonService;
import com.adobe.aem.guides.wknd.core.utils.Network;


@Component(immediate = true, service = ReadJsonService.class)
public final class ReadJsonDataImpl implements ReadJsonService {

	private static final String URL = "https://jsonplaceholder.typicode.com/todos/";

	/**
	 * Overridden method which will read the JSON data via an HTTP GET call
	 */
	@Override
	public String getData() {
		
		String response = Network.readJson(URL);
		
		return response;
	}
}
