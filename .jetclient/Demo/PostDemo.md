```toml
name = 'PostDemo'
method = 'POST'
url = 'http://localhost:8080/api/v1/demodata'
sortWeight = 3000000
id = '71d15a27-ae17-43bd-b9fa-8853ad229056'

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
