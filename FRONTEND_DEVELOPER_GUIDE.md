# Frontend Development Guide

## Template Structure

### Base Template (base.html)
All pages inherit from `base.html`. This ensures consistent styling and navigation across the entire application.

**Template Inheritance:**
```django
{% extends 'base.html' %}
{% load static %}

{% block title %}Page Title{% endblock %}

{% block content %}
    <!-- Your content here -->
{% endblock %}
```

## Bootstrap Classes Reference

### Colors
- `bg-primary` - Blue background
- `bg-danger` - Red background
- `bg-success` - Green background
- `text-primary` - Blue text
- `text-danger` - Red text
- `text-success` - Green text

### Spacing (margin/padding)
- `m-1` to `m-5` - Margins
- `p-1` to `p-5` - Padding
- `mt-3` - Margin top
- `mb-4` - Margin bottom
- `ps-2` - Padding start (left)
- `pe-2` - Padding end (right)

### Layout
- `.container` - Fixed width responsive container
- `.container-fluid` - Full width container
- `.row` - Grid row
- `.col-*` - Grid columns (col-12, col-lg-4, etc.)
- `d-grid` - Full width button container
- `d-flex` - Flexbox container

### Common Components

#### Button
```html
<button class="btn btn-primary">Text</button>
<a href="#" class="btn btn-secondary">Link Button</a>
```

Button Variants: `btn-primary`, `btn-secondary`, `btn-success`, `btn-danger`, `btn-warning`, `btn-info`

#### Cards
```html
<div class="card">
    <div class="card-header">
        Header Text
    </div>
    <div class="card-body">
        Body content
    </div>
</div>
```

#### Forms
```html
<form class="needs-validation" novalidate>
    <div class="mb-3">
        <label for="field" class="form-label">Label</label>
        <input type="text" class="form-control" id="field" name="field" required>
        <div class="invalid-feedback">
            Error message
        </div>
    </div>
</form>
```

#### Alerts
```html
<div class="alert alert-danger alert-dismissible fade show" role="alert">
    <i class="fas fa-exclamation-circle"></i> Error message
    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
</div>
```

Alert Types: `alert-danger`, `alert-success`, `alert-info`, `alert-warning`

#### Tables
```html
<table class="table">
    <thead>
        <tr>
            <th>Header 1</th>
            <th>Header 2</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Data 1</td>
            <td>Data 2</td>
        </tr>
    </tbody>
</table>
```

## Icons (Font Awesome)

Common Icons:
- `fas fa-home` - Home
- `fas fa-user` - User
- `fas fa-lock` - Lock
- `fas fa-search` - Search
- `fas fa-check-circle` - Check mark
- `fas fa-exclamation-circle` - Warning
- `fas fa-info-circle` - Info
- `fas fa-users` - Multiple users
- `fas fa-cube` - Box/Product
- `fas fa-map-marker-alt` - Location
- `fas fa-save` - Save
- `fas fa-sign-out-alt` - Logout
- `fas fa-plus-circle` - Add

Find more: https://fontawesome.com/icons

## CSS Custom Variables

Located in `modern-style.css`:
```css
:root {
    --primary-color: #0066cc;
    --secondary-color: #6c757d;
    --success-color: #28a745;
    --danger-color: #dc3545;
    --light-bg: #f8f9fa;
}
```

## Creating New Templates

### Template Example:
```django
{% extends 'base.html' %}
{% load static %}

{% block title %}Page Title - Blockchain SCM{% endblock %}

{% block content %}
<div class="main-container">
    <div class="container">
        <div class="row mb-4">
            <div class="col-lg-8 offset-lg-2">
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title">
                            <i class="fas fa-icon"></i> Page Title
                        </h3>
                    </div>
                    <div class="card-body p-4">
                        <p>Your content here</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
{% endblock %}
```

## Responsive Design Tips

### Breakpoints
- `col-6` - 50% on all screens
- `col-lg-4` - 33% on large screens, full width on mobile
- `col-md-6 col-lg-4` - 50% on medium, 33% on large

### Navigation in Mobile
- Navbar automatically collapses on mobile
- Use `navbar-toggler` for menu button

## Form Validation

Bootstrap provides built-in validation:
- Add `needs-validation` class to form
- Add `required` attribute to inputs
- Add `invalid-feedback` div for error messages

JavaScript validates automatically on submit.

## Common Patterns

### Success Message
```html
<div class="alert alert-success">
    <i class="fas fa-check-circle"></i> Operation successful!
</div>
```

### Error Message
```html
<div class="alert alert-danger">
    <i class="fas fa-exclamation-circle"></i> Something went wrong
</div>
```

### Information Card
```html
<div class="card bg-light">
    <div class="card-body">
        <p><i class="fas fa-info-circle"></i> Important information</p>
    </div>
</div>
```

### Button Group
```html
<div class="d-grid gap-2">
    <button class="btn btn-primary">Primary Action</button>
    <button class="btn btn-secondary">Secondary Action</button>
</div>
```

## Customization

### To Change Primary Color
Edit `modern-style.css`:
```css
:root {
    --primary-color: #YOUR_COLOR_HERE;
}
```

### To Change Font
Edit `modern-style.css` body section:
```css
body {
    font-family: 'Your Font Name', sans-serif;
}
```

## Browser DevTools Tips

1. Use Chrome DevTools to test responsive design
2. Toggle device toolbar (Ctrl+Shift+M on Windows)
3. Test different screen sizes
4. Check for console errors

## Performance Optimization

Templates are already optimized with:
- CDN-hosted Bootstrap and Font Awesome
- No unnecessary inline styles
- Minimal custom CSS
- Defer loading non-critical resources

## Accessibility Checklist

✅ Semantic HTML structure
✅ Form labels for all inputs
✅ Icon + text for buttons
✅ Color contrast suitable for WCAG AA
✅ Keyboard navigation support
✅ ARIA labels where needed

---

**Happy Coding! 🚀**
