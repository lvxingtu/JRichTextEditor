/* ******************************************************************************
 *
 *       Copyright 2008-2010 Hans Dijkema
 *
 *   JRichTextEditor is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as 
 *   published by the Free Software Foundation, either version 3 of 
 *   the License, or (at your option) any later version.
 *
 *   JRichTextEditor is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with JRichTextEditor.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * ******************************************************************************/

package nl.dykema.jxmlnote.widgets.marks;

import nl.dykema.jxmlnote.interfaces.MarkMarkupProvider;
import nl.dykema.jxmlnote.interfaces.MarkMarkupProviderMaker;

public class DefaultMarkMarkupProviderMaker implements MarkMarkupProviderMaker {
	DefaultMarkMarkupProvider _provider=new DefaultMarkMarkupProvider();

	public MarkMarkupProvider create(String markId, String markClass) {
		return _provider;
	}

}
