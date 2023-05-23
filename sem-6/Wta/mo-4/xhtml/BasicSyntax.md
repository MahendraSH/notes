# Basic Synatax ;

## w3schools

https://www.w3schools.com/html/html_xhtml.asp

## The Most Important Differences from HTML

- ### <!DOCTYPE> is mandatory
- ### The xmlns attribute in `<html>` is mandatory
- ### `<html>`, `<head>`, `<title>`, and `<body> `are mandatory

```xhtml
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml11/DTD/xhtml11-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Title of document</title>
  </head>
  <body>
    some content here...
  </body>
</html>
```

- ### Elements must always be properly nested

- ### Elements must always be closed

```xhtml
<br />
<hr />
<img src="" alt="" />
```

- ### Elements must always be in lowercase
- ### Attribute names must always be in lowercase

- ### Attribute values must always be quoted

```xhtml
<img src="" alt " " width="10" hight="10"/>
```

- ### Attribute minimization is forbidden

* #### correct

```xhtml
<input type="checkbox" name="vehicle" value="car" checked="checked" />
<input type="text" name="lastname" disabled="disabled" />
```

- #### wrong

```xhtml
<input type="checkbox" name="vehicle" value="car" checked />
<input type="text" name="lastname" disabled />
```
