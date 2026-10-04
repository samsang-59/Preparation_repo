# JavaScript Mistakes

| Date | Topic | What I thought | Correct idea | Revised? |
|---|---|---|---|---|
| 2026-10-04 | JS-1 hoisting / TDZ | `console.log(y); let y = 5;` → 5, then undefined | `let`/`const` are hoisted but sit in the Temporal Dead Zone → ReferenceError "Cannot access 'y' before initialization". Only `var` gives `undefined`. | ❌ |
