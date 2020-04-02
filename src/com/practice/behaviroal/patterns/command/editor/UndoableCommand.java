package com.practice.behaviroal.patterns.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
