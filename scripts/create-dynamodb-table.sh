#!/usr/bin/env bash

set -e

aws dynamodb create-table \
  --table-name books \
  --attribute-definitions \
  AttributeName=post_id,AttributeType=S \
  AttributeName=book_id,AttributeType=S \
  AttributeName=title,AttributeType=S \
  AttributeName=author_name,AttributeType=S \
  AttributeName=author_id,AttributeType=S \
  --key-schema \
  AttributeName=post_id,KeyType=HASH \
  --provisioned-throughput ReadCapacityUnits=10,WriteCapacityUnits=10 \
  --global-secondary-indexes file://scripts/gsi.json \
  --endpoint-url http://localhost:11000 \
  --region ap-northeast-2 || true | cat