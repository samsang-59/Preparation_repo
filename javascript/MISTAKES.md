# JavaScript Mistakes

| Date | Topic | What I thought | Correct idea | Revised? |
|---|---|---|---|---|
| 2026-10-04 | JS-1 hoisting / TDZ | `console.log(y); let y = 5;` → 5, then undefined | `let`/`const` are hoisted but sit in the Temporal Dead Zone → ReferenceError "Cannot access 'y' before initialization". Only `var` gives `undefined`. | ❌ |
| 2026-10-04 | JS-1 scope / typeof | `var` inside if → undefined, `let` → 2; `typeof null` → null / ReferenceError | `var` is function-scoped → leaks out of `{}` (a = 1). `let` is block-scoped → outside it's "not defined" (ReferenceError), which is different from `undefined`. `typeof null` === "object" (historic bug); check with `x === null`. | ❌ |
| 2026-10-04 | JS-2 closures | `makeCounter` counter() x3 → 1,1,1; `for (var i...) setTimeout(log i)` → 3,2,1 then 3 | makeCounter runs once → one `count` in the closure → 1,2,3. Loop with `var` = ONE shared i; timeouts run after loop ends when i = 4 → 4,4,4. With `let` each iteration gets its own i → 1,2,3. | ❌ |
| 2026-10-05 | JS-3 shallow copy | `{...user1}` copies inner objects too → user1.address.city stays "Pune" | Spread = SHALLOW copy: top-level values copied, nested objects only by reference (shared). Changing user2.address.city also changes user1 → "Delhi". Deep copy: `structuredClone(obj)`. | ❌ |
| 2026-10-05 | JS-4 async/await order | `test(){log A; await null; log B}; test(); log C` → C, A, B | An async function runs synchronously until the first `await` → A first. Code after await goes to the microtask queue → runs after current sync code (C). Order: A, C, B. | ❌ |
| 2026-10-05 | Git: commit didn't happen | Ran `git commit` without saving/`git add` → "no changes added to commit" → got fast-forward instead of conflict | Flow is edit → SAVE → git add → git commit. Check the commit printed `[branch abc123]`. A conflict needs BOTH branches to commit different changes to the same line. | ❌ |
