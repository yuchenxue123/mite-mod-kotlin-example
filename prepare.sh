#!/bin/bash

GRADLE_HOME="${GRADLE_USER_HOME:-$HOME/.gradle}"

echo "好1：$GRADLE_HOME"

SOURCE_FILE="mite/mite.jar"

echo "好2：SOURCE_FILE"

TARGET_DIR="$GRADLE_HOME/caches/fml-loom/1.6.4-MITE/"
TARGET_FILENAME="1.6.4-MITE+R196.jar"

mkdir -p "$TARGET_DIR"

if [ ! -f "$SOURCE_FILE" ]; then
  echo "Cannot find source file: $SOURCE_PATH" >&2
  echo "早不到"
  exit 1
fi
  cp "$SOURCE_PATH" "$TARGET_DIR/$TARGET_FILENAME"