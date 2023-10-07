import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('../views/homeView.vue'),
      alias: '/inicio',
    },
    {
      path: '/tasks',
      name: 'anonimo',
      component: () => import('../views/taskView.vue'),
    },
  ],
});

export default router;
