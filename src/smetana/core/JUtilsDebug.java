/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
 * 
 * This file is part of Smetana.
 * Smetana is a partial translation of Graphviz/Dot sources from C to Java.
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * This translation is distributed under the same Licence as the original C program.
 * 
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC
 * LICENSE ("AGREEMENT"). [Eclipse Public License - v 1.0]
 * 
 * ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES
 * RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
 * 
 * You may obtain a copy of the License at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package smetana.core;

import smetana.core.debug.SmetanaDebug;

public class JUtilsDebug {

	public static boolean TRACE = false;
	public static boolean TRACE_FINAL_CALL = false;
	public static boolean VERY_VERBOSE = false;

	private static SmetanaDebug debug;

	private static SmetanaDebug debug() {
		if (debug == null)
			debug = new SmetanaDebug();
		return debug;
	}

	static public void LOG(String s) {
		if (TRACE)
			debug().logline(s);

	}

	static public void ENTERING(String signature, String methodName) {
		if (TRACE)
			debug().entering(signature, methodName);
	}

	static public void LEAVING(String signature, String methodName) {
		if (TRACE)
			debug().leaving(signature, methodName);
	}

	public static void reset() {
		if (TRACE)
			debug().reset();
	}

	public static void printMe() {
		if (TRACE && TRACE_FINAL_CALL)
			debug().printMe();
	}

}
