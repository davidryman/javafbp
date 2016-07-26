/*
 * JavaFBP - A Java Implementation of Flow-Based Programming (FBP)
 * Copyright (C) 2009, 2016 J. Paul Morrison
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, see the GNU Library General Public License v3
 * at https://www.gnu.org/licenses/lgpl-3.0.en.html for more details.
 */

package com.jpmorrsn.fbp.engine;


public class NullOutputPort extends OutputPort

/**
 * This class is an internal control block used while processing a component's annotations; 
 * it is also used for checking 'connect' invocations in network definitions
 *   
 */

{  
  // The send function.
  @Override
  public void send(final Packet packet) {
    /*sender.drop(packet);*/
	 // do nothing - experimental 
  }

  @Override
  public void close() {
    // do nothing
  }

  /**
   * This method returns true if the output port is connected
   * 
   * @return boolean
   */
  @Override
  public boolean isConnected() {
    return false;
  }

}
