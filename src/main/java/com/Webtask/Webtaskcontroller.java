package com.Webtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webtaskcontroller {
		@GetMapping(value="/webtask")	
		public String getthis() {
			return "Successfully completed";
		}

	
}
