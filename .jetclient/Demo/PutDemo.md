```toml
name = 'PutDemo'
method = 'PUT'
url = 'http://localhost:8080/api/v1/demodata/3'
sortWeight = 4000000
id = 'b2c5c042-1274-42e0-a9f7-57d493d07919'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "id": 3,
  "name": "Joey Deen",
  "email": "joey@email.com",
  "phone": "088990022",
  "address": "255 Main St."
}'''
```
