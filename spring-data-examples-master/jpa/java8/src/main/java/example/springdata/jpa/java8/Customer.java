/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.jpa.java8;

import javax.persistence.Entity;

/**
 * @author Oliver Gierke
 */
@Entity
public class Customer extends AbstractEntity {

	String firstname, lastname;

	public Customer(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
	}
}
