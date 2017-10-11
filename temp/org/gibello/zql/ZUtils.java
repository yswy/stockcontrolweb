/*
 * This file is part of Zql.
 *
 * Zql is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Zql is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Zql.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.gibello.zql;

import java.util.HashMap;
import java.util.Map;

import org.gibello.zql.bench.FunctionDesc;

import com.bench.common.lang.StringUtils;
import com.bench.common.lang.exception.BenchRuntimeException;

public class ZUtils {

	private static Map<String, FunctionDesc> fcts_ = null;

	public static final int VARIABLE_PLIST = 10000;

	public static void addCustomFunction(String fct, int nparm, boolean hasMoreParams) {
		if (fcts_ == null)
			fcts_ = new HashMap<String, FunctionDesc>();
		if (nparm < 0)
			nparm = 1;
		FunctionDesc funDesc = fcts_.get(fct);
		if (funDesc != null) {
			throw new BenchRuntimeException("SQL函数" + fcts_ + "已登记了");
		}
		funDesc = new FunctionDesc(fct, nparm, hasMoreParams);
		fcts_.put(funDesc.getName().toUpperCase(), funDesc);
	}

	public static FunctionDesc getCustomFunction(String fct) {
		return fcts_.get(StringUtils.toUpperCase(fct));
	}

	public static boolean isAggregate(String op) {
		String tmp = op.toUpperCase().trim();
		return tmp.equals("SUM") || tmp.equals("AVG") || tmp.equals("MAX") || tmp.equals("MIN")
				|| tmp.equals("COUNT") || (fcts_ != null && fcts_.get(tmp) != null);
	}

	public static String getAggregateCall(String c) {
		int pos = c.indexOf('(');
		if (pos <= 0)
			return null;
		String call = c.substring(0, pos);
		if (ZUtils.isAggregate(call))
			return call.trim();
		else
			return null;
	}

};
