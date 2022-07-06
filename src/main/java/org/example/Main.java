package org.example;/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is the maven-archetype-har.
 *
 * The Initial Developer of the Original Code is
 * the Vermont Department of Taxes.
 * Portions created by the Initial Developer are Copyright (C) 2007
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Tom Cort <tom.cort@state.vt.us>
 *
 * ***** END LICENSE BLOCK ***** */
import java.io.Serializable;
public class Main implements Serializable {

	public static void main(String args[]){
		System.out.println("welcome to our App!");
		User user = new User("ammar","1234");
		user.login();

	}

}
