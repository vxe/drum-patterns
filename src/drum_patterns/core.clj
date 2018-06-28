(ns drum-patterns.core)


(use 'overtone.live)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))



(defn glissando [freq envelope-shape]
  (let [env (envelope [0 0.5 1] [1 1] envelope-shape)]
    (demo (sin-osc :freq (+ 200 (* 200 (env-gen env :action FREE)))))))

