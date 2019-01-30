/*
 * SonarLint Core - Implementation
 * Copyright (C) 2009-2019 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.sonarlint.core.container.model;

import org.sonarqube.ws.WsComponents.ShowWsResponse;
import org.sonarsource.sonarlint.core.client.api.connected.RemoteProject;
import org.sonarsource.sonarlint.core.proto.Sonarlint.ProjectList;

public class DefaultRemoteProject implements RemoteProject {
  private final String key;
  private final String name;

  public DefaultRemoteProject(ProjectList.Project project) {
    this.key = project.getKey();
    this.name = project.getName();
  }

  public DefaultRemoteProject(ShowWsResponse r) {
    this.key = r.getComponent().getKey();
    this.name = r.getComponent().getName();
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public String getName() {
    return name;
  }
}
