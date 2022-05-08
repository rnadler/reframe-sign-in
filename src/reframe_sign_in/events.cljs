(ns reframe-sign-in.events
  (:require
   [re-frame.core :as re-frame]
   [reframe-sign-in.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
            db/default-db))

(re-frame/reg-event-db
  ::change-password
  (fn-traced [db [_ password]]
    (assoc db :password password)))
