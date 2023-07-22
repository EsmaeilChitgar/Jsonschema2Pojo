package com.echitgar.schema.interfaces;

import java.util.UUID;

public interface PrinterInterface {
  UUID getId();
  void setId(UUID id);

  String getName();
  void setName(String name);

  String getModel();
  void setModel(String modelName);
}
