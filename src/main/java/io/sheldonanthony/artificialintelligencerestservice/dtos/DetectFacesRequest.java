package io.sheldonanthony.artificialintelligencerestservice.dtos;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * Copyright (c) 2020, Sheldon Anthony
 * All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  
 * 
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sheldon Anthony, PostNet Suite 129,
 * Private Bag X 1510, Glenvista, 2058, Johannesburg, South Africa
 * or visit https://shakes082.github.io/sheldonanthonyio.github.io/
 * if you need additional information
 *  or have any questions.
 */

@JsonPropertyOrder({"uuid", "base64EncodedImage"})
public final class DetectFacesRequest{
	
	@JsonProperty
	private String uuid;
	
	@JsonProperty
	private String base64EncodedImage; 
	
	public DetectFacesRequest(){
	}

	public DetectFacesRequest(String uuid, String base64EncodedImage) {
		super();
		this.uuid = uuid;
		this.base64EncodedImage = base64EncodedImage;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getBase64EncodedImage() {
		return base64EncodedImage;
	}

	public void setBase64EncodedImage(String base64EncodedImage) {
		this.base64EncodedImage = base64EncodedImage;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
