/*
 * Copyright (c) 2015 University of Massachusetts
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * Initial developer(s): V. Arun
 */
package edu.umass.cs.nio.interfaces;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author arun
 *
 * @param <MessageType>
 */
public interface AddressMessenger<MessageType> {
	/**
	 * @param isa
	 * @param msg
	 * @return Number of characters written. The number of characters is calculated 
	 * by converting MessageType to a String. If MessageType is a byte[], then 
	 * ISO-8859-1 encoding is used.
	 * @throws IOException
	 */
	public int sendToAddress(InetSocketAddress isa, MessageType msg)
			throws IOException;

	/**
	 * @param isa
	 * @param msg
	 * @return The number of bytes written.
	 * @throws IOException
	 */
	public int sendToAddress(InetSocketAddress isa, byte[] msg)
			throws IOException;

}
